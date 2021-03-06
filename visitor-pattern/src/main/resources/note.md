# 访问者模式
## 1 定义
> 封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
### 1.1 角色
#### 1.1.1  visitor 抽象访问者
> 抽象类或者接口，声明访问者可以访问哪些元素，具体到程序里就是visit方法的参数定义哪些对象是可以被访问的。
#### 1.1.2 ConcreteVisitor 具体访问者
> 它影响访问者访问到一个类后该怎么干，要做什么事情。
#### 1.1.3 Element 抽象元素
> 接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的 
#### 1.1.4 ConcreteElement 具体元素
> 实现accept方法，通常是visitor.visit(this) ,基本上都形成了一种模式了
#### 1.1.5 ObjectStructure 结构对象
> 元素产生者，一般容纳在多个不同类、不同接口的容器，如List、Set、Map等，在项目中，一般很少抽象出这个角色
## 2 应用
### 2.1 优点
#### 2.1.1 符合单一职责原则
> 具体元素角色也就是Employee抽象类的两个子类负责数据的加载，而Visitor类则负责报表的展现，两个不同的职责非常
> 明确的分离开来，各自演绎变化
#### 2.1.2 优秀的扩展性
> 由于职责分开，继续增加对数据的操作是非常快捷的。
#### 2.1.3 灵活性非常高
### 2.2 缺点
#### 2.2.1 具体元素对访问者公布细节
> 访问者要访问一个类就必要要求这个类公布一些方法和数据，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的
#### 2.2.2 具体元素变更比较困难
> 具体元素角色的增加、删除、修改都是比较困难的
#### 2.2.3 违背了依赖倒置原则
> 访问者依赖的是具体元素，而不是抽象元素，这破坏了依赖倒置原则，特别是在面向对象的编程中，抛弃了对接口的依赖，而直接依赖实现类，扩展比较难
### 3 场景
> 一个对象结构包含很多类对象，他们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作，也就是用迭代器模式已经不能胜任的情景。
> 
> 需要对一个对象结构中的对象进行很多不同并且不相关的操作，而你想避免让这些操作”污染“这些对象的类。
> 
> 总结：
> > 业务规则要求遍历多个不同的对象。这本身也是访问者模式出发点，迭代器模式只能访问同类或同接口的数据，而访问者模式是对迭代器模式的扩充，可以遍历不同的对象
> > 然后执行不同的操作，也就是针对访问的对象不同，执行不同的操作。
### 4 扩展
#### 4.1 统计功能 statistic
#### 4.2 多个访问者 multiple visitors
#### 4.3 双分派问题
##### 4.3.1 分派问题
> 变量被声明时的类型叫做变量的静态类型又叫明显类型。
> 
> 变量所引用的对象的真实类型又叫做变量的实际类型。
> 
> 根据对象的类型而对方法进行的选择，就是分派。根据分派发生的时期，可以将分派分为静态分派和动态分派。
##### 4.3.2 静态分派
> 静态分派发生在编译时期，分派根据静态类型信息发生，方法重载就是静态分派。（所谓的编译时多态）
##### 4.3.3 动态分派
> 动态分派发生在运行时期，动态分派动态地置换掉某个方法。面向对象的语言利用动态分派来实现方法置换时产生的多态性。（所谓的运行时多态）
##### 4.3.4 多分派
> 方法的接收者和方法的参数值统称为方法的宗量，根据分派基于宗量多少（接收者是一个宗量，参数是一个宗量），可以将分派分成单分派和多分派。
> 静态绑定属于多分派 动态绑定属于单分派
###### 4.3.4.1 单分派
> 单分派是指根据一个宗量就可以知道调用目标。处理一个操作是根据请求者的名称和接收到的参数决定的，在Java中有静态绑定和动态绑定之说，它的实现是根据重载和覆写实现的。
###### 4.3.4.2 双分派
> 根据多个宗量才能确定调用目标。双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型，它是多分派的一个特例。从这里也可以看到Java是一个支持静态的多分派和动态地单分派语言。
> 但是可以通过设计模式在java语言里面实现动态地双重分派。