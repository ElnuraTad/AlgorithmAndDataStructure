public class AlgorithmGasStation {
    public static void main(String[] args) {
        int[] stations = {0,200,375,550,750,950};
        System.out.println(minStop(stations,400));
    }

    //returns -1 if it's impossible to get from A to B
    public static int minStop(int[] stations, int capacity){
        int result = 0;
        int currentStop = 0;

        while(currentStop < stations.length -1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;
            if (currentStop == nextStop)
                return -1;
            if (nextStop < stations.length - 1)
                result++;
            currentStop = nextStop;
        }
        return result;
    }
}
