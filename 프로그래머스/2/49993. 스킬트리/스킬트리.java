class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            int index = 0;
            boolean isValid = true;

            for (char c : tree.toCharArray()) {
                int position = skill.indexOf(c);

                if (position == -1) continue;

                if (position == index) {
                    index++;
                } else {
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}