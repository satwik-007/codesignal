//change the return type

map<String, int> mp = new HashMap<>();
    for(int i = 0; i<id.length; i++) {
        mp[id[i]]++;
    }
	for (int i = 0; i< messages.length; i++) {
        List list = Arrays.asList(messages);
        Stream stream = list.stream().filter(name -> name.startsWith("@"));
        stream.collect(Collectors.toList()));
      }

      for(String s: Collectors) {
          s.subString(1);
          String[] temp = s.split(",");
          for(int i = 0; i< temp.length; i++) {
              if(mp.find[temp[i] != mp.end())
                mp[temp[i]]++;
            }
      }

      return mp;