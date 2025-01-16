class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int sX = 0, sY = 0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                sX = i;
                sY = park[i].indexOf('S');
            }
        }
        
        System.out.println(sX + " " + sY);
        
        answer[0] = sX;
        answer[1] = sY;
        
        for (String route : routes) {
            String[] routeArr = route.split(" ");
            String op = routeArr[0];
            int n = Integer.parseInt(routeArr[1]);
            
            int nX = answer[0];
            int nY = answer[1];
            boolean flag = true; 
            for (int i = 0; i < n; i++) {
                switch (op) {
                    case "N":
                        nX -= 1;
                        break;
                    case "S":
                        nX += 1;
                        break;
                    case "W":
                        nY -= 1;
                        break;
                    case "E":
                        nY += 1;
                        break;
                }
                
                if ((nX < 0 || nX >= park.length) 
                    || (nY < 0 || nY >= park[0].length()) 
                    || park[nX].charAt(nY) == 'X') {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                answer[0] = nX;
                answer[1] = nY;
            }
            
        }
        
        return answer;
    }
}