import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_Phone_Keypad_Problem {
    private Map<Character, String> map = new HashMap<>();

    public _17_Phone_Keypad_Problem(){
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    private void solve(String digits, int index, StringBuilder temp , List<String> result){
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }

        char currentChar = digits.charAt(index);
        String value = map.get(currentChar);

        for(char ch : value.toCharArray()){
            temp.append(ch);
            solve(digits, index + 1, temp, result);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        solve(digits,0,new StringBuilder(),result);
        return result;
    }
}
