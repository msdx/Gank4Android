package zhou.gank.io.model

import groovy.transform.CompileStatic
import groovy.transform.ToString;

@CompileStatic
@ToString
class GankDaily {

    public List<String> types;
    public List<List<Gank>> ganks;

    int size() {
        return types.size();
    }

    String getType(int index) {
        return types.get(index);
    }

    List<Gank> getGanhuo(int index) {
        return ganks.get(index);
    }

    GankDaily(List<String> types, List<List<Gank>> ganks) {
        this.types = types
        this.ganks = ganks
    }

    GankDaily() {
    }
}