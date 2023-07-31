package goldDigger.models.spot;

import goldDigger.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class SpotImpl implements Spot {
    private String name;
    private Collection<String> exhibits;

    public SpotImpl(String name) {
        this.name = name;
        this.exhibits = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.SPOT_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    public void setExhibits(Collection<String> exhibits) {
        this.exhibits = exhibits;
    }
}
