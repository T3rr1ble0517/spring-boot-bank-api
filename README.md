# spring-boot-bank-api
# Spring Boot 银行交易数据查询API

## 项目简介
这是一个使用 **Spring Boot** 框架构建的简易银行交易数据查询API服务。项目模拟了银行核心系统的后端接口，以RESTful风格提供结构化的交易数据。

**核心价值**：作为学习Spring Boot的入门实践，本项目完成了从搭建框架、设计数据模型到发布API接口的完整流程，体现了将Java后端技术应用于金融业务场景的基本能力。

## 技术栈
- **后端框架**: Spring Boot 3.x
- **构建工具**: Maven
- **语言**: Java 17
- **API风格**: RESTful

## 项目结构

## 如何运行本项目

### 前提条件
1.  安装 **JDK 17** 或更高版本。
2.  安装 **Maven**（或使用IDE内嵌的）。
3.  一个IDE（如 IntelliJ IDEA, VSCode）或命令行工具。

### 运行步骤
1.  **克隆项目到本地**
    ```bash
    git clone https://github.com/你的用户名/spring-boot-bank-api.git
    cd spring-boot-bank-api
    ```

2.  **使用Maven启动项目**
    ```bash
    # 在项目根目录下执行
    mvn spring-boot:run
    ```
    *或者直接在IDE中运行 `BankApiApplication.java` 文件。*

3.  **访问API**
    项目启动后，默认端口为 `8080`。在浏览器或API测试工具（如Postman）中访问以下地址：
    ```
    GET http://localhost:8080/transactions
    ```
    **预期返回结果** (JSON格式示例):
    ```json
    [
      {
        "id": 1001,
        "customerId": "C1001",
        "type": "存款",
        "amount": 5000.0,
        "channel": "网银"
      },
      {
        "id": 1002,
        "customerId": "C1002",
        "type": "取款",
        "amount": -2000.0,
        "channel": "ATM"
      }
    ]
    ```

## 核心功能与设计
1.  **数据模型 (Model)**: `BankTransaction` 类定义了交易数据的核心字段。
2.  **API接口 (Controller)**: `TransactionController` 通过 `@RestController` 和 `@GetMapping` 注解，对外提供 `GET /transactions` 查询接口。
3.  **约定优于配置**: Spring Boot自动处理了Web服务器启动、JSON序列化等复杂配置。

## 项目迭代计划 (Roadmap)
本项目是一个可扩展的起点，未来计划沿以下方向演进：
- **V2.0 (进行中)**: 集成MySQL数据库，使用Spring Data JPA实现数据持久化。
- **V2.1**: 增加更多业务API，如按客户ID查询、交易提交等。
- **V3.0**: 添加前端界面(Vue/React)，形成完整的前后端分离应用。
- **V4.0**: 加入用户认证、日志、API文档(Swagger)等生产级特性。

## 联系与许可
- **作者**: 你的名字或GitHub主页链接
- **项目初衷**: 此项目为个人学习Spring Boot及后端开发所创建。
- **版权说明**: 遵循 MIT 许可证。欢迎自由参考与学习。
