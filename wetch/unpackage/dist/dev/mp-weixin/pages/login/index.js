"use strict";
const common_vendor = require("../../common/vendor.js");
const common_assets = require("../../common/assets.js");
const api_request = require("../../api/request.js");
if (!Array) {
  const _easycom_uv_toast2 = common_vendor.resolveComponent("uv-toast");
  _easycom_uv_toast2();
}
const _easycom_uv_toast = () => "../../uni_modules/uv-toast/components/uv-toast/uv-toast.js";
if (!Math) {
  _easycom_uv_toast();
}
const _sfc_main = {
  __name: "index",
  setup(__props) {
    const login = common_vendor.ref({
      user: "",
      password: ""
    });
    const loginStatus = common_vendor.ref(true);
    const toast = common_vendor.ref("");
    const toLogin = async () => {
      const r = (await api_request.request.post("/login", {
        "user": login.value.user,
        "password": login.value.password
      })).data;
      if (r.code !== 200) {
        toast.value.show({
          type: "error",
          message: r.msg + "请检查账号或密码.....",
          duration: 1500,
          loading: true,
          position: "bottom"
        });
      } else {
        localStorage.setItem("token", r.data);
        toast.value.show({
          type: "success",
          message: r.msg + "正在进入系统.....",
          duration: 1e3,
          position: "bottom",
          overlay: true,
          loading: true,
          complete() {
            setTimeout(() => {
              common_vendor.index.switchTab({
                url: "/pages/index/index"
              });
            }, 500);
          }
        });
      }
    };
    return (_ctx, _cache) => {
      return common_vendor.e({
        a: common_vendor.sr(toast, "67c2a0ea-0", {
          "k": "toast"
        }),
        b: common_assets._imports_0,
        c: loginStatus.value
      }, loginStatus.value ? {
        d: common_vendor.o(($event) => loginStatus.value = !loginStatus.value)
      } : {}, {
        e: !loginStatus.value
      }, !loginStatus.value ? {
        f: login.value.user,
        g: common_vendor.o(($event) => login.value.user = $event.detail.value),
        h: login.value.password,
        i: common_vendor.o(($event) => login.value.password = $event.detail.value),
        j: common_vendor.o(toLogin)
      } : {});
    };
  }
};
wx.createPage(_sfc_main);
