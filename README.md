# Base
这是给自己写的一个基类模板，以后会不断完善！
暂时只有BaseActivity和BaseFragment的模板，里面包括对findViewById的泛型封装，提供
一次结束所有Activity退出应用的功能，fragment懒加载的实现，由于个人不喜欢ButterKnife，
个人见解是其实用了注解代码量还是增加了，只不过换了位置而已，既然都没有性能损耗，还是直接用
原装就好了，所以不会对这个进行封装，而且暂时觉得不会对第三方库封装进Base类，开源日新月异，
我都是有必要再继承一次封装，当然因为一些库并不是每个地方都要用统一封装感觉不够灵活，还是
用的时候手写一点比较好，由于刚写，还有很多漏洞，欢迎提意见，后续会有比较多的内容加进来，
希望做个最好用的基类！