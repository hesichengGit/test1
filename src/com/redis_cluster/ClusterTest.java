package com.redis_cluster;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.DataBindingException;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPubSub;

@SuppressWarnings("unused")
public class ClusterTest {

	private static JedisCluster jedis;

	public static void connection() {
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		for (int i = 7001; i < 7007; i++) {
			jedisClusterNodes.add(new HostAndPort("192.168.1.182", i));
		}
		jedis = new JedisCluster(jedisClusterNodes);
		System.out.println("连接成功");
	}

	public static void main(String[] args) {
		connection();
		ClusterTest cluster = new ClusterTest();
		cluster.redisString();
		cluster.redisHash();
		cluster.redisList();
		cluster.redisSet();
		cluster.redisKey();
		Set<String> set = cluster.clusterKeys("*");
		System.out.println(set);
		cluster.redissubscribe();
		cluster.redisPublish();
	}

	/**
	 * String(字符串)
	 */
	public void redisString() {
//        jedis.set("username", "jonychen");//将字符串值value关联到key(添加) key-value
//        System.out.println(jedis.get("username"));//获取key中的value
//		jedis.append("age", "22");//如果key存在并且是字符串就在value的末尾追加值
//		jedis.decr("age");//将key中储存的数字值-1
//		jedis.decrBy("age", 5);//将key中储存的数字值-5
//		jedis.incr("age");//将key中储存的数字值+1
//		jedis.incrBy("age", 7);//将key中储存的数字值+7
//		jedis.incrByFloat("age", 5.5);//将key中储存的数字值+5.5(小数类型)
//		System.out.println(jedis.getrange("name", 0, -1));//获取key中字符串的值,值的取值范围是0(从第一个字符开始)到-1(到最后一个字符)
//		System.out.println(jedis.getSet("addr", "beijing"));//取出key中旧的value,再将新的value设入到key
//        jedis.del("username");
//		jedis.setex("sm", 100, "smsmsm");//设置一个生存时间为100秒的key-value
//		jedis.setnx("aa","aaaabb");//同时设置一个或多个key-value,且设置key都不存在(如果存在则不被设置)
//		jedis.setrange("aa", 2, "ccc");//覆盖key-value下标为2后面的值,加上新的值(ccc)
//		System.out.println(jedis.strlen("name"));//获取key所储存值的长度
//		Long msetnx = jedis.msetnx(  "{m}" + "aaa", "adfsa", "{m}" + "bbb", "100");//插入一个或多个key-value
//		System.out.println(msetnx);
//		System.out.println(jedis.mget("{m}" + "aaa","{m}" + "bbb"));//返回一个或多个的key的值
	}

	/**
	 * hash(哈希表)
	 */
	public void redisHash() {
//		jedis.hset("hash", "name", "hesicheng");//将哈希表 key 中的域 field 的值设为 value  (key-field-value)

//		Map<String,String> map = new HashMap<>();
//		map.put("aa", "aa");
//		map.put("bb", "bb");
//		map.put("dd", "bb");
//		map.put("cc", "111");
//		jedis.hmset("hash1",map );//在哈希表hash1中同时将多个 field-value (域-值)对设置到哈希表 key 中

//		jedis.hdel("hash1", "aa");//删除哈希表中中的一个或多个指定域
//		jedis.hexists("hash1", "dd");//检查哈希表中的dd域是否存在
//		System.out.println(jedis.hget("hash1", "bb"));//返回哈希表 hash1 中给定域 field 的值

//		System.out.println(jedis.hgetAll("hash1"));//返回哈希表 hash1 中,所有的域和值

//		jedis.hincrBy("hash1", "cc", 1);//为哈希表 hash1 中的域 cc 的值+1
//		jedis.hincrByFloat("hash1", "cc", 3.3);为哈希表 hash1 中的域 cc 的值+3.3(小数点类型)

//		System.out.println(jedis.hkeys("hash1"));//返回哈希表 hash1 中的所有域

//		System.out.println(jedis.hlen("hash"));//返回哈希表hash的长度

//		System.out.println(jedis.hmget("hash", "aa","bb","cc"));//返回哈希表 key 中，一个或多个给定域的值

//		System.out.println(jedis.hvals("hash"));//返回哈希表 key 中所有域的值
	}

	/**
	 * list(列表)
	 */
	public void redisList() {
//		jedis.lpush("list", "aa","bb","cc", "aa","bb","cc");//将一个或多个值 value 插入到列表 key 的表头
//		jedis.lpush("list1", "aa","bb","cc", "aa","bb","cc");
//		jedis.rpush("list", "gg","ii");将一个或多个值 value 插入到列表 key 的表尾
//		jedis.rpush("list1", "gg","ii");
//		jedis.rpushx("list", "11","22");将一个或多个值 value 插入到列表 key 的表尾(如果表不存在则无效)

//		jedis.lset("list", 2, "iop");
//		jedis.lrem("list1", 2, "aa");
//		jedis.lpop("list");//删除并返回列表 key 的头value
//		jedis.rpop("list");//删除并返回列表 key 的value
//		System.out.println(jedis.blpop(2, "list"));//删除list列表的表头值(然后第一个返回key值,再返回value值)(如果key不存在操作就会被阻塞)
//		System.out.println(jedis.brpop(0, "list"));//删除list列表的表尾值(然后第一个返回key值,再返回value值)(如果key不存在操作就会被阻塞)

//		jedis.brpoplpush("list", "list1", 1);//将list列表中的表尾值弹出,作为list1列表的表头值(如果key不存在操作就会被阻塞)
//		jedis.rpoplpush("list", "list1");//将list列表中的表尾值弹出,作为list1列表的表头值
//		jedis.lindex("list", 2);//返回列表key下标为index的元素
//		jedis.linsert("list", BinaryClient.LIST_POSITION.BEFORE, "bb", "before");//将值before插在list列表中bb元素之前(将值 value 插入到列表 key 当中，位于值 pivot 之前或之后)
//		System.out.println(jedis.llen("list"));//返回列表list的长度
//		System.out.println(jedis.lrange("list", 0, -1));//返回list列表中的所有元素
//		jedis.ltrim("list1", 0, 2);//删除list列表下标0-2以外的所有元素
	}

	/**
	 * set(集合)
	 */
	public void redisSet() {
//		jedis.sadd("set", "aa","cc","ee","hh","11","33","44","tt");//将一个或多个 member 元素加入到集合 key 当中
//		jedis.sadd("set1", "aa1","cc2","ee3","hh4");
//		
//		System.out.println(jedis.scard("set1"));//返回集合key的总元素
//		System.out.println(jedis.sismember("set", "aa"));//判断aa是否是set集合的元素
//		System.out.println(jedis.smembers("set1"));//得到集合key中的所以元素
//		jedis.smove("set", "ni", "ee");//将 ee 元素从 set 集合移动到 ni 集合(会删除set集合里面的ee元素)
//		jedis.spop("set");//移除并返回集合中的一个随机元素
//		System.out.println(jedis.srandmember("set",1));//返回集合中的一个随机元素
//		jedis.srem("set", "cc2");//移除集合 key 中的一个或多个 member 元素
//		System.out.println(jedis.sunion("set","set1"));//返回一个集合的全部元素
//		jedis.sunionstore("ssio", "set1");//将set1集合覆盖ssio集合(若没有ssio集合就自动创建一个)
	}

	/**
	 * key(key键)
	 */
	public void redisKey() {
//		jedis.del("aa");//删除一个或者多个key

//		System.out.println(jedis.exists("rrr"));//检查key是否存在
//		jedis.expire("ccc", 20);//给key设置20秒的生存时间
//		jedis.expireAt("ccc", 124645600);//给key设置生存时间(时间戳)
//		jedis.move("bb", 1);//将当前数据库的key移动到数据库1当中
//		jedis.persist("ccc");//移除key的生存时间
//		System.out.println(jedis.pttl("list"));//返回key的剩余生存时间
//		jedis.rename("name", "name1");//将key-name改名为newkey-name1

//		jedis.lpush("ag", "1","5","9","4","8");
//		System.out.println(jedis.sort("ag"));//得到经过排序后的value

//		System.out.println(jedis.ttl("set"));//返回key的剩余生存时间
//		System.out.println(jedis.type("age"));//得到key所属的类型
	}
	
	/**
	 * keys查询
	 * @param pattern
	 * @return
	 * @throws DataBindingException
	 */
	public Set<String> clusterKeys(String pattern) throws DataBindingException {
		Set<String> result = new HashSet<>();
		try {
			// 获取Redis集群内所有节点
			Map<String, JedisPool> clusterNodes = jedis.getClusterNodes();

			for (Map.Entry<String, JedisPool> entry : clusterNodes.entrySet()) {
				Jedis jedis = entry.getValue().getResource();
				// 判断非从节点(因为若主从复制，从节点会跟随主节点的变化而变化)
				if (!jedis.info("replication").contains("role:slave")) {
					// 搜索单个节点内匹配的Key
					Set<String> keys = jedis.keys(pattern);
					// 合并搜索结果
					result.addAll(keys);
				}
				jedis.close();
			}
		} catch (Exception e) {
			throw new DataBindingException(e);
		} 
		return result;
	}
	
	/**
	 * 消息订阅
	 */
	public void redissubscribe() {
		 // 订阅一个事件
        JedisPubSub sub = new JedisPubSub() {

            private int count;

            /**
             * 收到订阅消息回调
             * @param channel 订阅的消息通道
             * @param message 消息内容
             */
            @Override
            public void onMessage(String channel, String message) {
                count++;
                if (count > 3) {
                    unsubscribe(channel);
                    count = 0;
                    return;
                }
                System.out.println("onMessage--->channel: " + channel + ", message: " + message);
            }

            // 消息订阅成功回调
            @Override
            public void onSubscribe(String channel, int subscribedChannels) {
                System.out.println("onSubscribe---->channel:" + channel + ", subscribedChannels: " + subscribedChannels);
            }

            /**
             * 消息取消息订阅回调
             */
            @Override
            public void onUnsubscribe(String channel, int subscribedChannels) {
                System.out.println("onUnsubscribe--->channel: " + channel + ", subscribedChannels: " + subscribedChannels);
            }

            /**
             * 收到模式匹配主题消息回调（可以用*通配符匹配）
             * @param pattern 模式匹配主题
             * @param channel 发送消息的具体主题
             * @param message 消息内容
             */
            @Override
            public void onPMessage(String pattern, String channel, String message) {
                count++;
                if (count > 3) {
                    punsubscribe();
                    count = 0;
                    return;
                }
                System.out.println("onPMessage---->pattern: " + pattern+ ", channel:" + channel + ", message: " + message);
            }

            /**
             * 模式主题订阅成功回调
             * @param pattern 模式匹配主题
             * @param subscribedChannels
             */
            @Override
            public void onPSubscribe(String pattern, int subscribedChannels) {
                System.out.println("onPSubscribe---->pattern:" + pattern + ", subscribedChannels: " + subscribedChannels);
            }

            /**
             * 模式主题取消订阅回调
             * @param pattern 模式匹配主题
             * @param subscribedChannels
             */
            @Override
            public void onPUnsubscribe(String pattern, int subscribedChannels) {
                System.out.println("onUnsubscribe--->pattern: " + pattern + ", subscribedChannels: " + subscribedChannels);
            }
        };

        // 订阅模式匹配消息
        jedis.psubscribe(sub,"hunan");
	}
	
	/**
	 * 消息发布publish
	 */
	public void redisPublish() {
		jedis.publish("hunan", "xiaomangguo");
	}
}
