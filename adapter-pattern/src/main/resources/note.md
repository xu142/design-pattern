# 适配器模式
## 1.定义
> 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
## 1.1 贫血对象与充血对象
> 一个对象如果不存储实体状态以及对象之间的关系，该对象就叫做贫血对象，对应的领域模型就是贫血领域模式。
> 有实体状态和对象关系的模型就是充血领域模型。
## 1.2 三个角色
### 1.2.1 Target目标角色
> 该角色定义把其他类转化为何种接口，也就是我们的期望接口，例子中的IUserInfo接口就是目标角色。
### 1.2.2 Adaptee 源角色
> 把谁转化为目标角色，这个就是源角色，他是已经存在的，运行良好的类或对象，经过适配器角色的包装，它会成为一个崭新、靓丽的角色
### 1.2.3 Adapter 适配器角色
> 适配器模式的核心角色，其他两个角色都是已经存在的角色，而适配器角色是需要新建立的，他的职责非常简单：把源角色转化为目标角色，通过
> 继承或是类关联的方式
## 2.应用
### 2.1 优点
> 适配器模式可以让两个没有任何关系的类在一起运行，只要适配器这个角色能够搞定他们就成
> 
> 增加了类的透明性
> 
> 提高了类的复用度
> 
> 灵活性非常好
### 2.2 使用场景
> 有动机修改一个已经投产中的接口时，适配器模式可能是最适合的模式。
> 比如说系统扩展了，需要使用一个已有或新建立的类，但这个类又不符合系统的接口。
## 3.扩展
> 对象适配器
> 
> 之前通过继承进行的适配叫做类适配器。对象适配器是通过对象层次的关联关系进行委托的，而不是继承关系。
> 
> 类适配器是类间继承，对象适配器是对象的合成关系，也可以说是类的关联关系，这是两者的根本区别。
