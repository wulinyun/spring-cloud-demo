java中创建线程池的方式一般有两种
1.通过Executors工厂方法创建
2.通过new ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue)自定义创建