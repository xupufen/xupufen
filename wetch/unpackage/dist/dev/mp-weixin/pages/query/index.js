"use strict";
const common_vendor = require("../../common/vendor.js");
if (!Array) {
  const _easycom_uv_swiper2 = common_vendor.resolveComponent("uv-swiper");
  _easycom_uv_swiper2();
}
const _easycom_uv_swiper = () => "../../uni_modules/uv-swiper/components/uv-swiper/uv-swiper.js";
if (!Math) {
  _easycom_uv_swiper();
}
const _sfc_main = {
  __name: "index",
  setup(__props) {
    const list = common_vendor.ref([
      "https://cdn.uviewui.com/uview/swiper/swiper3.png",
      "https://cdn.uviewui.com/uview/swiper/swiper2.png",
      "https://cdn.uviewui.com/uview/swiper/swiper1.png",
      "https://cdn.uviewui.com/uview/swiper/swiper3.png",
      "https://cdn.uviewui.com/uview/swiper/swiper2.png",
      "https://cdn.uviewui.com/uview/swiper/swiper1.png"
    ]);
    return (_ctx, _cache) => {
      return {
        a: common_vendor.p({
          list: list.value,
          indicator: true,
          indicatorMode: "line",
          circular: true
        })
      };
    };
  }
};
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["__scopeId", "data-v-21264cba"]]);
wx.createPage(MiniProgramPage);
