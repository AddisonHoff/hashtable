public class doesitwork {
    public static void main(String[] args)
    {
        hashtable hasht = new hashtable(5);


        hasht.put("key1", "value1");
        hasht.put("key2", "value2");
        hasht.put("key3", "value3");
        hasht.put("key4", "value4");

        System.out.println(hasht.get("key2"));
        System.out.println(hasht.size);

    }
}
