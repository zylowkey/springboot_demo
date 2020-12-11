//package com.goldcard.springboot_demo.register;
//
//import org.apache.curator.RetryPolicy;
//import org.apache.curator.framework.CuratorFramework;
//import org.apache.curator.framework.CuratorFrameworkFactory;
//import org.apache.curator.retry.ExponentialBackoffRetry;
//import org.apache.zookeeper.CreateMode;
//
//public class CuratorZookeeper {
//    public static void main(String[] args) throws Exception {
//        // Zookeeper集群地址，多个节点地址可以用逗号分隔
//        String zkAddress = "150.158.163.164:2181";
//        // 重试策略，如果连接不上ZooKeeper集群，会重试三次，重试间隔会递增
//        RetryPolicy policy = new ExponentialBackoffRetry(1000, 3);
//        // 创建Curator Client并启动，启动成功之后，就可以与Zookeeper进行交互了
//        CuratorFramework client = CuratorFrameworkFactory.newClient(zkAddress, policy);
//        client.start();
//        // 下面简单说明Curator中常用的API
//        // create()方法创建ZNode，可以调用额外方法来设置节点类型、添加Watcher
//        // 下面是创建一个名为"user"的持久节点，其中会存储一个test字符串
//        String path = client.create().withMode(CreateMode.PERSISTENT)
//                .forPath("/user", "test".getBytes());
//        System.out.println(path);
//    }
//}
