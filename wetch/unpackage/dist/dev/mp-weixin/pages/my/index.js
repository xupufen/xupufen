"use strict";
const common_vendor = require("../../common/vendor.js");
if (!Array) {
  const _easycom_uv_avatar2 = common_vendor.resolveComponent("uv-avatar");
  _easycom_uv_avatar2();
}
const _easycom_uv_avatar = () => "../../uni_modules/uv-avatar/components/uv-avatar/uv-avatar.js";
if (!Math) {
  _easycom_uv_avatar();
}
const _sfc_main = {
  __name: "index",
  setup(__props) {
    return (_ctx, _cache) => {
      return {
        a: common_vendor.p({
          src: "",
          size: "60"
        }),
        b: common_vendor.f(20, (item, index, i0) => {
          return {};
        })
      };
    };
  }
};
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["__scopeId", "data-v-f97bc692"]]);
wx.createPage(MiniProgramPage);
