package pl.md.webjsonreducer.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class JsonEntry {

    private FilteredContents innerObject;

    @JsonAnySetter
    public void setProperty(String key, FilteredContents value) {
        innerObject = value;
    }

    public FilteredContents getFilteredContents(){
        return innerObject;
    }

}
