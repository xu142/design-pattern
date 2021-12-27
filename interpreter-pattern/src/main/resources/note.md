# 解释器模式
## 1 定义
> 给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语句中的句子。
### 1.1 角色
#### 1.1.1 AbstractExpression 抽象解释器
> 具体的解释任务由各个实现类完成，具体的解释器分别由TerminalExpression 和 NonterminalExpression 完成
#### 1.1.2 TerminalExpression 终结符表达式
> 实现与文法中的元素相关关联的解释操作，通常一个解释器模式中只有一个终结符表达式，但有多个实例，对应不同的终结符。
#### 1.1.3 NonterminalExpression 非终结符表达式
> 文法中我的每条规则对应于一个非终结表达式。
#### 1.1.4 Context 环境角色
