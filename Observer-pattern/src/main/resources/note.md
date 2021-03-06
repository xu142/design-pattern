# 观察者模式
## 1 定义
> 定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新
## 1.1 角色
### 1.1.1 Subject 被观察者
> 定义被观察者必须实现的职责，他必须能够动态地增加、取消观察者。他一般是抽象类或者实现类，仅仅完成作为被观察者必须实现的职责：管理观察者并通知观察者。
### 1.1.2 Observer 观察者
> 观察者接收到消息后，即进行update（更新方法）操作，对接收到的信息进行处理
### 1.1.3 ConcreteSubject 具体的被观察者
> 定义被观察者自己的业务逻辑，同时定义对哪些世间进行通知。
### 1.1.4 ConcreteObserver 具体的观察者
> 每个观察在接收到消息后的处理反应是不同的，各个观察者有自己的处理逻辑。
## 2 应用
### 2.1 优点
#### 2.1.1 观察者与被观察者之间是抽象耦合
> 如此设计，不管是增加观察者还是被观察者都非常容易扩展。
#### 2.2.2 建立一套触发机制
> 根据单一职责原则，每个类的职责是单一的，而观察者模式可以将各个单一的职责串联成真实世界的复杂的逻辑关系。形成一个触发链。
### 2.2 缺点
> 观察者需要考虑一下开发效率和运行效率问题，一个被观察者多个观察者，开发和测试就会比较复杂，而且在java中消息的通知默认是顺序执行的，
> 一个观察者卡壳会影响整体的执行效率。这种情况下考虑采用异步。
### 2.3 使用场景
> 关联行为场景。需要注意的是，关联行为是可拆分的，而不是“组合”关系
> 
> 事件多级触发场景
> 
> 跨系统的消息交换场景，如消息队列的处理机制
### 2.4 注意事项
#### 2.4.1 广播链问题
> 一个观察者可以有双重身份，既是观察者，又是被观察者。 链一旦建立，这个逻辑就比较复杂，可维护性非常差，所以根据经验建议，
> 在一个观察者模式中最多出现一个对象既是观察者也是被观察者，也就是说消息最多转发一次（传递两次）。
#### 2.4.2 异步处理问题
> 被观察者发生动作，观察者要做出回应，如果观察者比较多，而且处理时间比较长就需要使用异步。
> 异步处理就要考虑线程安全和队列的问题。
### 2.5 和责任链的区别
> 和责任链的最大区别就是观察者广播链在传播的过程中，消息是随时更改的，它是由相邻的两个节点协商的消息结构；而责任链模式在消息传递过程中基本上
> 保持消息不可变，如果要改变也只是在原有的消息上修正。
## 3 扩展
> JDK 中提供了 Observable实现类 和Observer接口
### 3.1 项目中真实的观察者模式
> 在系统设计中会对观察者模式进行改造或改装，主要在以下三个方面
#### 3.1.1 观察者和被观察者之间的消息沟通
> 被观察者状态改变会触发观察者的一个行为，同时会传递一个消息给观察者，在实际中一般的做法是：观察者中的update方法接受两个参数，一个是被观察者，一个是
> DTO，DTO一般是一个纯洁的JavaBean，由被观察者生成，由观察者消费。
#### 3.1.2 观察者响应方式
> 在一个观察者多个被观察者的情况下，观察者的执行时间会被拉长。如何快速响应？
##### 3.1.2.1 多线程技术
> 异步架构
##### 3.1.2.1 缓存技术
> 同步架构
#### 3.1.3 被观察者尽量自己做主
> 可以自主选择是否通知观察者，而不是在消息到达观察者时才判断是否要消费
### 4 最佳实践
> 文件系统  猫鼠游戏  ATM 取钱  广播收音机