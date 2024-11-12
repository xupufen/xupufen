"use strict";
const common_vendor = require("../common/vendor.js");
const request = {
  // 请求配置
  config: {
    baseURL: "http://localhost:8080",
    header: {
      "Content-Type": "application/json"
    },
    method: "GET",
    data: {},
    timeout: 3e4,
    dataType: "json",
    responseType: "text"
  },
  // 请求拦截器
  interceptors: {
    request: (config) => {
      config.header.token = localStorage.getItem("token");
      return config;
    },
    response: (response) => {
      if (response.statusCode > 1) {
        return response;
      } else {
        return Promise.reject(response);
      }
    }
  },
  request(options = {}) {
    options = Object.assign({}, this.config, options);
    options.method = options.method.toUpperCase();
    const requestInterceptor = this.interceptors.request(options);
    if (requestInterceptor === false) {
      return Promise.reject("请求参数错误");
    }
    return new Promise((resolve, reject) => {
      common_vendor.index.request({
        url: options.baseURL + options.url,
        method: options.method,
        data: options.data,
        header: options.header,
        timeout: options.timeout,
        dataType: options.dataType,
        responseType: options.responseType,
        success: (res) => {
          const responseInterceptor = this.interceptors.response(res);
          if (responseInterceptor && responseInterceptor.then) {
            responseInterceptor.then(resolve).catch(reject);
          } else {
            resolve(responseInterceptor);
          }
        },
        fail: (err) => {
          reject(err);
        }
      });
    });
  },
  // 快速方法
  get(url, data, options) {
    return this.request({
      url,
      data,
      method: "GET",
      ...options
    });
  },
  post(url, data, options) {
    return this.request({
      url,
      data,
      method: "POST",
      ...options
    });
  },
  delete(url, data, options) {
    return this.request({
      url,
      data,
      method: "DELETE",
      ...options
    });
  },
  put(url, data, options) {
    return this.request({
      url,
      data,
      method: "DELETE",
      ...options
    });
  }
};
exports.request = request;
