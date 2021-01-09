const path = require("path");
const resolve = function(dir) {
    return path.join(__dirname, dir);
};
module.exports = {
    publicPath: process.env.NODE_ENV === "production" ? "/dist/" : "./",
    outputDir: "dist",
    assetsDir: "static",
    lintOnSave: false, // 是否开启eslint保存检测
    productionSourceMap: false, // 是否在构建生产包时生成sourcdeMap
    chainWebpack: config => {
        config.resolve.alias
        .set("@", resolve("src"))
        .set("@v", resolve("src/views"))
        .set("@c", resolve("src/components"))
        .set("@u", resolve("src/utils"))
        config.optimization.runtimeChunk("single");
    },
    devServer: {
        host: "192.168.0.104",
        /* 本地ip地址 */
        port: "8080",
        hot: true,
        /* 自动打开浏览器 */
        open: true,
        overlay: {
            warning: false,
            error: true
        },
        /* 跨域代理 */
        proxy: {
            "/api": {
                /* 目标代理服务器地址 */
                target: "http://192.168.0.104:8068", //
                /* 允许跨域 */
                changeOrigin: true,
                ws: true,
                pathRewrite: {
                    "^/api": ""
                }
            }
        }
    }
};