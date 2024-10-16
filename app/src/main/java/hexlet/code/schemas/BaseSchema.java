package hexlet.code.schemas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BaseSchema<T> {
    protected Map<String, Predicate<T>> validators = new LinkedHashMap<>();

    public final void addValidator(String key, Predicate<T> validator) {
        validators.put(key, validator);
    }

    public final boolean isValid(Object value) {
        return validators.values().stream().allMatch(validator -> validator.test((T) value));
    }
}
