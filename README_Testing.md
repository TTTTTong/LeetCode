# LeetCode_003 单元测试说明

## 概述
为 `LeetCode_003.java` 文件创建了完整的单元测试，测试"无重复字符的最长子串"功能。

## 文件说明
- `LeetCode_003.java` - 原始实现文件（已修改方法为public）
- `LeetCode_003_Test.java` - 单元测试文件
- `run_tests.sh` - 测试运行脚本

## 测试覆盖范围
测试用例包括：
1. 空字符串
2. 单个字符
3. 所有字符相同
4. 无重复字符
5. 重复字符在末尾
6. 重复字符在开头
7. 复杂情况
8. 包含空格
9. 包含数字
10. 包含特殊字符
11. 长字符串
12. 重复模式
13. 边界情况
14. 中文字符
15. 混合字符

## 运行测试

### 方法1：使用脚本（推荐）
```bash
./run_tests.sh
```

### 方法2：手动编译运行
```bash
# 编译
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar LeetCode_003.java LeetCode_003_Test.java

# 运行测试
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore LeetCode_003_Test
```

## 依赖
需要JUnit 4.13.2和Hamcrest 1.3库。如果没有这些库，可以从以下地址下载：
- JUnit: https://github.com/junit-team/junit4/releases
- Hamcrest: https://github.com/hamcrest/JavaHamcrest/releases

## 测试结果说明
- 如果所有测试通过，会显示测试成功信息
- 如果有测试失败，会显示具体的失败原因和期望值