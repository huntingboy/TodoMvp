 # todo-mvp架构的使用(model和view间没有耦合,和mvc架构最大区别)
 >1.contract接口(包括内部接口view和presenter)  
 2.view层实现(activity,fragment)  
 3.presenter实现(内部持有view 和 repository即model层)  
 4.model层实现(repository即datasource, entity)  

_该项目只是一个逻辑上的框架,并没有实现,
 比如数据源的CRUD和缓存策略_
