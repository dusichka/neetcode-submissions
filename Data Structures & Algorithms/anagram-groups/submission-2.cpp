class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;
        for(string& word:strs){
        
            string sorted_word = word;
            sort(sorted_word.begin(), sorted_word.end());
            mp[sorted_word].push_back(word);
        }
        vector<vector<string>> result;
        for(auto& pair : mp){
            result.push_back(pair.second);
        }
        return result;
    }
};
