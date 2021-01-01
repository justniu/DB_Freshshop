<template>
    <div>
        <p>用户信息</p>
        <table>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
                <td>密码</td>
            </tr>
            <tr v-for="user in users" v-bind:key="user">
                <td>{{user.userId}}</td>
                <td>{{user.userName}}</td>
                <td>{{user.userPassword}}</td>
            </tr>
        </table>
    </div>
</template>

<script>
    export default {
        name: "users",
        data(){
            return {
                users:''
            }
        },
        created() {
            var _this=this;
            this.axios.get('/users').then(function (resp) {
                _this.users=resp.data;
            })
        }
    }
</script>

<style scoped>

</style>