# 装饰模式
## 1.定义
> 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更加灵活。
### 1.1四个角色
####1.1.1 Component 抽象构件
> Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对象，如上面的成绩单
> 
> 在装饰模式中，必然有一个最基本、最核心、最原始的接口或抽象类充当Component抽象构件
####1.1.2 ConcreteComponent 具体构件
> ConcreteComponent 是最核心、最原始、最基本的接口或抽象类的实现，要装饰的就是他
####1.1.3 Decorator 装饰角色
> 一般是一个抽象类，实现接口或者抽象方法，它里面不一定有抽象的方法，但在它的属性里必然有一个private变量
> 指向Component抽象构件
#### 1.1.4 具体装饰角色
> ConcreteDecoratorA 和 ConcreteDecoratorB 是两个具体的装饰类，要把最核心、最原始、最基本的东西装饰城其他东西。
## 2.应用
### 2.1 优点
> 装饰类和被装饰类可以独立发展，而不会相互耦合。换句话说，Component类无需知道Decorator类，Decorator类是从外部来扩展Component类的功能，
> 而Decorator也不用知道具体的构件
> 
> 装饰模式是继承关系的一个替代方案。
> 
> 装饰模式可以动态地扩展一个实现类的功能。
### 2.2 缺点
> 多层的装饰是比较复杂的。
> 想象剥洋葱一样，到最后才发现是最里面的装饰出现了问题。因此尽量减少装饰类的数量，以便降低系统的复杂度。
### 2.3 使用场景
> 需要扩展一个类的功能，或给一个类增加附加功能
> 
> 需要动态地给一个对象增加功能，这些功能可以再动态的撤销
> 
> 需要为一批的兄弟类进行改装或加装功能，当然是首选装饰模式
## 3.最佳实践
> 装饰模式是对继承的有利补充。
> 
> 要知道继承不是万能的，继承可以解决实际的问题，但是在项目中要考虑诸如易维护、易扩展、易复用等，而且在一些情况下要是用继承就会增加很多子类，而且灵活性非常差，维护不易。
> 也就是说装饰模式可以替代继承，解决膨胀的问题。同时，继承还是静态的给类增加功能，而装饰模式则是动态地增加功能。
> 
> 装饰模式还有一个非常好的优点：扩展性非常好。