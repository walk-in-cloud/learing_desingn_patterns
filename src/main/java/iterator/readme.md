#### 迭代器模式 

- #####优点
    1. 用户使用迭代器访问集合中的对象，而不需要知道这些对象在集合中是如何表示
    及存储的
    2. 用户可以同时使用多个迭代器遍历一个集合
- #####使用情景
    1. 让用户访问一个集合中的对象，但不想暴露对象在集合中的存储结构
    2. 希望对遍历不同集合提供一个统一的接口
- #####迭代器模式包含的四种角色
    1. 集合：一个接口，规定了具体集合需要实现的操作
    2. 具体集合：是实现集合接口类的实例，按照一定的结构存储对象。具体集合应当有一个方法，返回一个针对该集合的
    具体迭代器
    3. 迭代器：一个接口，规定了遍历具体集合的方法，比如next()
    4. 具体迭代器：实现迭代器接口的实例。具体迭代器在实现迭代器接口所规定的遍历集合的方法是，比如next()，要保证next()首次调用
    将按照集合的数据结构找到集合中的一个对象，而且每当找到一个对象，立刻根据该集合的存储结构得到待遍历的后继对象的引用，并保证一次调用next()
    方法可以遍历集合