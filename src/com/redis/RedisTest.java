package com.redis;

import redis.clients.jedis.Jedis;

@SuppressWarnings("unused")
public class RedisTest {
	
	private static Jedis jedis = new Jedis();
	
	public static void connection() {
		jedis = new Jedis("192.168.1.182",6379);
		System.out.println("���ӳɹ�");
	}
	
	public static void main(String[] args) {
		connection();
		RedisTest rt = new RedisTest();
		rt.redisString();
		rt.redisHash();
		rt.redisList();
		rt.redisSet();
		rt.redisKey();
	}
	
	/**
	 * String(�ַ���)
	 */
	public void redisString() {
//		jedis.set("name", "hesicheng");//���ַ���ֵvalue������key(���) key-value
//		System.out.println(jedis.get("name"));//��ȡkey�е�value
//		jedis.mset("age","11","addr","shanghai");//ͬʱ����һ�����߶��key-value
//		jedis.append("age", "22");//���key���ڲ������ַ�������value��ĩβ׷��ֵ
//		List<String> list = jedis.mget("name","age","addr","shanghai");//ͬʱȡ��һ������key-value
//		System.out.println(list);
		
//		jedis.decr("age");//��key�д��������ֵ-1
//		jedis.decrBy("age", 5);//��key�д��������ֵ-5
//		jedis.incr("age");//��key�д��������ֵ+1
//		jedis.incrBy("age", 7);//��key�д��������ֵ+7
//		jedis.incrByFloat("age", 5.5);//��key�д��������ֵ+5.5(С������)
//		System.out.println(jedis.getrange("name", 0, -1));//��ȡkey���ַ�����ֵ,ֵ��ȡֵ��Χ��0(�ӵ�һ���ַ���ʼ)��-1(�����һ���ַ�)
//		System.out.println(jedis.getSet("addr", "beijing"));//ȡ��key�оɵ�value,�ٽ��µ�value���뵽key
//		jedis.msetnx("aa","aa","name","aaa");//ͬʱ����һ������key-value,������key��������(��������򲻱�����)
//		jedis.setex("sm", 100, "smsmsm");//����һ������ʱ��Ϊ100���key-value
//		jedis.setnx("aa","aaaabb");//ͬʱ����һ������key-value,������key��������(��������򲻱�����)
//		jedis.setrange("aa", 2, "ccc");//����key-value�±�Ϊ2�����ֵ,�����µ�ֵ(ccc)
//		System.out.println(jedis.strlen("name"));//��ȡkey������ֵ�ĳ���
	}
	
	/**
	 * hash(��ϣ��)
	 */
	public void redisHash() {
//		jedis.hset("hash", "name", "hesicheng");//����ϣ�� key �е��� field ��ֵ��Ϊ value  (key-field-value)
		
//		Map<String,String> map = new HashMap<>();
//		map.put("aa", "aa");
//		map.put("bb", "bb");
//		map.put("dd", "bb");
//		map.put("cc", "111");
//		jedis.hmset("hash1",map );//�ڹ�ϣ��hash1��ͬʱ����� field-value (��-ֵ)�����õ���ϣ�� key ��
		
//		jedis.hdel("hash1", "aa");//ɾ����ϣ�����е�һ������ָ����
//		jedis.hexists("hash1", "dd");//����ϣ���е�dd���Ƿ����
//		System.out.println(jedis.hget("hash1", "bb"));//���ع�ϣ�� hash1 �и����� field ��ֵ
		
//		System.out.println(jedis.hgetAll("hash1"));//���ع�ϣ�� hash1 ��,���е����ֵ
		
//		jedis.hincrBy("hash1", "cc", 1);//Ϊ��ϣ�� hash1 �е��� cc ��ֵ+1
//		jedis.hincrByFloat("hash1", "cc", 3.3);Ϊ��ϣ�� hash1 �е��� cc ��ֵ+3.3(С��������)
		
//		System.out.println(jedis.hkeys("hash1"));//���ع�ϣ�� hash1 �е�������
		
//		System.out.println(jedis.hlen("hash"));//���ع�ϣ��hash�ĳ���
		
//		System.out.println(jedis.hmget("hash", "aa","bb","cc"));//���ع�ϣ�� key �У�һ�������������ֵ
		
//		System.out.println(jedis.hvals("hash"));//���ع�ϣ�� key ���������ֵ
		
	}
	
	/**
	 * list(�б�)
	 */
	public void redisList() {
//		jedis.lpush("list", "aa","bb","cc", "aa","bb","cc");//��һ������ֵ value ���뵽�б� key �ı�ͷ
//		jedis.lpush("list1", "aa","bb","cc", "aa","bb","cc");
//		jedis.rpush("list", "gg","ii");��һ������ֵ value ���뵽�б� key �ı�β
//		jedis.rpush("list1", "gg","ii");
//		jedis.rpushx("list", "11","22");��һ������ֵ value ���뵽�б� key �ı�β(�������������Ч)
		
//		jedis.lset("list", 2, "iop");
//		jedis.lrem("list1", 2, "aa");
//		jedis.lpop("list");//ɾ���������б� key ��ͷvalue
//		jedis.rpop("list");//ɾ���������б� key ��value
//		System.out.println(jedis.blpop(2, "list"));//ɾ��list�б�ı�ͷֵ(Ȼ���һ������keyֵ,�ٷ���valueֵ)(���key�����ڲ����ͻᱻ����)
//		System.out.println(jedis.brpop(0, "list"));//ɾ��list�б�ı�βֵ(Ȼ���һ������keyֵ,�ٷ���valueֵ)(���key�����ڲ����ͻᱻ����)
		
//		jedis.brpoplpush("list", "list1", 1);//��list�б��еı�βֵ����,��Ϊlist1�б�ı�ͷֵ(���key�����ڲ����ͻᱻ����)
//		jedis.rpoplpush("list", "list1");//��list�б��еı�βֵ����,��Ϊlist1�б�ı�ͷֵ
//		jedis.lindex("list", 2);//�����б�key�±�Ϊindex��Ԫ��
//		jedis.linsert("list", BinaryClient.LIST_POSITION.BEFORE, "bb", "before");//��ֵbefore����list�б���bbԪ��֮ǰ(��ֵ value ���뵽�б� key ���У�λ��ֵ pivot ֮ǰ��֮��)
//		System.out.println(jedis.llen("list"));//�����б�list�ĳ���
//		System.out.println(jedis.lrange("list", 0, -1));//����list�б��е�����Ԫ��
//		jedis.ltrim("list1", 0, 2);//ɾ��list�б��±�0-2���������Ԫ��
	}
	
	/**
	 * set(����)
	 */
	public void redisSet() {
//		jedis.sadd("set", "aa","cc","ee","hh","11","33","44","tt");//��һ������ member Ԫ�ؼ��뵽���� key ����
//		jedis.sadd("set1", "aa1","cc2","ee3","hh4");
//		
//		System.out.println(jedis.scard("set1"));//���ؼ���key����Ԫ��
//		System.out.println(jedis.sdiff("set"));//����һ�����ϵ�ȫ��Ԫ��
//		jedis.sdiffstore("opop", "set1");//��set1���ϸ���opop����(��û��opop���Ͼ��Զ�����һ��)
//		System.out.println(jedis.sinter("set"));//����һ�����ϵ�ȫ��Ԫ��
//		jedis.sinterstore("aiai", "set");//��set1���ϸ���aiai����(��û��aiai���Ͼ��Զ�����һ��)
//		System.out.println(jedis.sismember("set", "aa"));//�ж�aa�Ƿ���set���ϵ�Ԫ��
//		System.out.println(jedis.smembers("set1"));//�õ�����key�е�����Ԫ��
//		jedis.smove("set", "ni", "ee");//�� ee Ԫ�ش� set �����ƶ��� ni ����(��ɾ��set���������eeԪ��)
//		jedis.spop("set");//�Ƴ������ؼ����е�һ�����Ԫ��
//		System.out.println(jedis.srandmember("set"));//���ؼ����е�һ�����Ԫ��
//		jedis.srem("set", "cc2");//�Ƴ����� key �е�һ������ member Ԫ��
//		System.out.println(jedis.sunion("set","set1"));//����һ�����ϵ�ȫ��Ԫ��
//		jedis.sunionstore("ssio", "set1");//��set1���ϸ���ssio����(��û��ssio���Ͼ��Զ�����һ��)
	}
	
	/**
	 * key(key��)
	 */
	public void redisKey() {
//		jedis.del("aa");//ɾ��һ�����߶��key
		
//		byte[] dump = jedis.dump("list");//���л�һ��key
//		System.out.println(dump.length);
		
//		System.out.println(jedis.exists("rrr"));//���key�Ƿ����
//		jedis.expire("ccc", 20);//��key����20�������ʱ��
//		jedis.expireAt("ccc", 124645600);//��key��������ʱ��(ʱ���)
//		System.out.println(jedis.keys("*"));//�������Է���pattern��key
//		jedis.move("bb", 1);//����ǰ���ݿ��key�ƶ������ݿ�1����
//		jedis.persist("bb");//�Ƴ�key������ʱ��
//		System.out.println(jedis.pttl("list"));//����key��ʣ������ʱ��
//		System.out.println(jedis.randomKey());//�ӵ�ǰ���ݿ����������һ��key
//		jedis.rename("name", "name1");//��key-name����Ϊnewkey-name1
		
//		jedis.lpush("ag", "1","5","9","4","8");
//		System.out.println(jedis.sort("ag"));//�õ�����������value
		
//		System.out.println(jedis.ttl("set"));//����key��ʣ������ʱ��
//		System.out.println(jedis.type("age"));//�õ�key����������
	}
}
