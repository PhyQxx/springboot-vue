<template>
    <div class="page">
        Index页面
    </div>
</template>

<script>
import { test } from '@/api/index.js'
    export default {
        data() {
            return {
               
            }
        },
        mounted () {
            this.test();
        },
        methods: {
            test() {
                test({id: '1'}).then((res) => {
                    console.log(res)
                })
            }
        },
    }
</script>

<style lang="scss" scoped>
.page{
    padding: 1rem;
    .nav{
        display: flex;
        justify-content: space-around;
        padding: 1rem 28rem;
        .search{
            width: 10rem;
        }
    }
}
</style>