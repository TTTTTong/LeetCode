#!/bin/bash

# 编译和运行LeetCode_003的单元测试
echo "编译Java文件..."
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar LeetCode_003.java LeetCode_003_Test.java

if [ $? -eq 0 ]; then
    echo "编译成功！运行测试..."
    java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore LeetCode_003_Test
else
    echo "编译失败！请检查代码。"
    exit 1
fi