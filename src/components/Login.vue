<template>
    <div class="login-container">
        <el-form ref="form" :model="form" label-width="80px" class="login-form">
        <h2 class="login-title">管理系统</h2>
        <el-form-item label="admin">
            <el-input v-model="form.username"></el-input>
        </el-form-item>
        <el-form-item label="密码">
            <el-input v-model="form.password"></el-input>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="onSubmit">登录</el-button>
        </el-form-item>
        </el-form>
  </div>
</template>

<script>
    export default {
  data() {
    return {
      form: {
        username: "admin",
        password: "admin"
      }
    };
  },
  methods: {
    onSubmit() {
      alert.log("submit!");
    }
  }
};
</script>

<style scoped>
 .login-form {
  width: 350px;
  margin: 160px auto; /* 上下间距160px，左右自动居中*/
  background-color: rgb(255, 255, 255, 0.8); /* 透明背景色 */
  padding: 30px;
  border-radius: 20px; /* 圆角 */
}


/* 标题 */
.login-title {
  color: #303133;
  text-align: center;
}
</style>