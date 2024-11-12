"use strict";
const common_vendor = require("../../../common/vendor.js");
const _sfc_main = {
  __name: "index",
  setup(__props) {
    common_vendor.onLoad((option) => {
      data.value = JSON.parse(option.data);
      console.log(data.value);
    });
    const data = common_vendor.ref();
    return (_ctx, _cache) => {
      return {
        a: data.value.i,
        b: common_vendor.t(data.value.msg)
      };
    };
  }
};
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["__scopeId", "data-v-c72c3b95"]]);
wx.createPage(MiniProgramPage);
