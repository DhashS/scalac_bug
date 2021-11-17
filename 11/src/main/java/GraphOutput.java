import java.util.HashMap;

public class GraphOutput<G, M> {
    public static <G, N, C, P> Builder<G, N, ?> newBuilder() {
        return new Builder<>();
    }


    public static final class Builder<G, N, M> {

        private HashMap<String, Object> properties;
        
        public Builder<G, N, M> attr(String name, Object value) {
            if (properties == null) {
                properties = new HashMap<>(5);
            }
            properties.put(name, value);
            return this;
        }
   }
}
