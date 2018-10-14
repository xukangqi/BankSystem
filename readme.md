银行基本业务系统后端实现

- 用户

登录，注册，修改个人资料，开通账户，修改密码，销户，企业还是个人

- 存取款

活期，定期，利率，查询余额，取款，到期取款


- 贷款  

贷款，利率，同业拆借，期限

- 汇票

转账，汇票，基金。



t_user

| 名称     | 类型    | 长度 | 主键  | 非空  | 描述     |
| -------- | ------- | ---- | ----- | ----- | -------- |
| userid   | int     | 16   | true  | true  | 用户ID   |
| username | varchar | 32   | false | false | 用户名   |
| password | varchar | 63   | false | false | 密码     |
| status   | varchar | 16   | false | false | 状态     |
| usertype | varchar | 16   | false | false | 用户类型 |
| sex      | varchar | 16   | false | false | 性别     |
| address  | varchar | 200  | false | false | 地址     |
| phone    | varchar | 32   | false | false | 联系电话 |
| email    | varchar | 200  | false | false | 邮箱     |
| photo    | varchar | 512  | false | false | 照片     |
| created  | int     | 10   | false | false | 创建时间 |
| edited   | int     | 10   | false | false | 编辑时间 |
|          |         |      |       |       |          |







用户表：t_LoginUser

| 名称      | 类型    | 长度 | 主键  | 非空  | 描述     |
| --------- | ------- | ---- | ----- | ----- | -------- |
| userid    | varchar | 16   | true  | true  | 用户ID   |
| loginname | varchar | 16   | false | false | 用户名   |
| password  | varchar | 16   | false | false | 密码     |
| status    | varchar | 16   | false | false | 状态     |
| usertype  | varchar | 16   | false | false | 用户类型 |
| creattime | int     | 10   | false | false | 创建时间 |
| edittime  | int     | 10   | false | false | 编辑时间 |

t_LoginUserInfo

| 名称      | 类型    | 长度 | 主键  | 非空  | 描述     |
| --------- | ------- | ---- | ----- | ----- | -------- |
| name      | varchar | 16   | true  | true  | 用户ID   |
| sex       | varchar | 16   | false | false | 用户名   |
| address   | varchar | 16   | false | false | 密码     |
| phone     | varchar | 16   | false | false | 状态     |
| email     | varchar | 16   | false | false | 用户类型 |
| photo     | int     | 10   | false | false | 创建时间 |
| userid    | int     | 10   | false | false | 编辑时间 |
| loginname |         |      |       |       |          |
| password  |         |      |       |       |          |
| usertype  |         |      |       |       |          |

t_UserInfo

| 名称     | 类型    | 长度 | 主键  | 非空  | 描述     |
| -------- | ------- | ---- | ----- | ----- | -------- |
| idnumber | varchar | 16   | true  | true  | 用户ID   |
| name     | varchar | 16   | false | false | 用户名   |
| address  | varchar | 16   | false | false | 密码     |
| sex      | varchar | 16   | false | false | 状态     |
| address  | varchar | 16   | false | false | 用户类型 |
| phone    | int     | 10   | false | false | 创建时间 |
| email    | int     | 10   | false | false | 编辑时间 |
| photo    |         |      |       |       |          |
| edittime |         |      |       |       |          |
| userid   |         |      |       |       |          |