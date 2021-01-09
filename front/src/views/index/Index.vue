<template>
    <div>
        index页面
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
                test().then((res) => {
                    console.log(res)
                })
            }
        },
    }
</script>

<style lang="scss" scoped>

</style>