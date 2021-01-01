// vue.config.js
module.exports = {
    devServer: {
      proxy: {
        '/': {
          target: 'http://localhost:8014', //要访问的那个url. 即vue使用端口到8014端口.
          changeOrigin: true,
          ws: true,
          pathRewrite: {
            '^/': ''
          }
        }
      }
    }
  }