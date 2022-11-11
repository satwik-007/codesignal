Deque<String> stack = new ArrayDeque<>();
        List<String> tmp1 = new ArrayList<String>();
        for(int i = 0; i<commands.length; i++) {
            String[] temp = commands[i].split(" ");
            tmp1.add(temp[1]);
        }
        String[] change = new String[ tmp1.size() ];
        tmp1.toArray(change);
        for (String directory : changeComponents) {
            if (directory.isEmpty() || directory.equals(CURRENT_DIRECTORY)) {
                continue;
            }
            if (directory.equals("/")){
                stack.clear();
            }
            else if (directory.equals(PREVIOUS_DIRECTORY)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(directory);
            }
        }
        StringBuilder path = new StringBuilder();
        Iterator<String> itr = stack.descendingIterator();
        while (itr.hasNext()) {
            path.append("/");
            path.append(itr.next());
        }
        return path.length() > 0 ? path.toString() : "/";