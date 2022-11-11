class HostName{
        string type;
        
        vector<int> numbers;
    public:
        HostName(string type1) {
            type = type1;
        }
    
            string allocateFirst() {
            int i = 0,available = 0;
            int size = numbers.size();
            while(i < size && (available = numbers[i]) == i + 1) {
                i++;
            }
            if(i<size){
                available = i+1;
                numbers[i] = available;
            }
            else {
                available++;
                numbers.push_back(available);
            }
            return type + available;
        }
        void deallocate(int number) {
            for(int i = 0; i< numbers.size(); i++) {
                if(numbers[i] == number) {
                    numbers.erase(numbers.begin()+i);
                    return;
                }
            }
        }
    }
    class Tracker {
        vector<HostName> allocatedHostnames;
        
    public:
        Tracker(vector<HostName> newVector) {
            allocatedHostnames = newVector;
        }
        string allocate(string hosttype) {
            HostName hostName;
            for(int i = 0; i< allocatedHostnames.size(); i++) {
                hostName = allocatedHostnames[i];
                if(hostName.type == hosttype) {
                    return hostName.allocateFirst();
                }
            }
            hostName = new HostName(hosttype);
            allocatedHostnames.push_back(HostName);
            return hostName.allocateFirst();
        }
        void deallocate(string hosttype){
            char ch;
            string type;
            int number,i;
            HostName hostname;
            for(i = 0; i< hosttype.length(); i++) {
                ch = hosttype.at(i);
                if(ch >= '0' && ch <= '9'){
                    break;
                }
            }
            type = hosttype.substr(0,i);
            number = stoi(hosttype.substr(i))
            for(int i = 0; i<allocatedHostnames.size(); i++) {
                hostname = allocatedHostnames[i];
                if(hostName.type == type) {
                    hostName.deallocate(number);
                    return;
                }
            }
        }
    }