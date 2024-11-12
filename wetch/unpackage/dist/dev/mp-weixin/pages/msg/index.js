"use strict";
const common_vendor = require("../../common/vendor.js");
const common_assets = require("../../common/assets.js");
const _sfc_main = {
  __name: "index",
  setup(__props) {
    const msg = common_vendor.ref([
      {
        title: "在线咨询",
        info: "暂时没消息"
      },
      {
        title: "在线咨询",
        info: "暂时没消息"
      },
      {
        title: "在线咨询",
        info: "暂时没消息"
      },
      {
        title: "在线咨询",
        info: "暂时没消息"
      }
    ]);
    return (_ctx, _cache) => {
      return {
        a: common_vendor.f(msg.value, (item, index, i0) => {
          return {
            a: common_vendor.t(item.title),
            b: common_vendor.t(item.info),
            c: index
          };
        }),
        b: common_assets._imports_0$1
      };
    };
  }
};
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["__scopeId", "data-v-6ddef3fc"]]);
wx.createPage(MiniProgramPage);
