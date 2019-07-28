package pl.md.webjsonreducer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.md.webjsonreducer.model.FilteredContents;
import pl.md.webjsonreducer.model.JsonEntry;

import java.util.List;

@RestController
@RequestMapping("/filter")
public class InputController {

    @PostMapping
    public FilteredContents filterResponse(@RequestBody List<JsonEntry> jsonEntries) {
//        The instructions were to parse input starting with "[" that means a list, so we need to tell it to the parser,
//        hence the List as the main parameter. It contains JsonEntries, as I suppose the parameter name
//        "2b727991-5ddb-4a42-82eb-13bbb2876a28" is dynamic, so the JsonEntry is parsed via @JsonAnySetter annotation.
//        (we don't need to know the name of the parameter that way).
//        The parameters value is the actual FilteredContents we want to return to the client and we're doing that
//        with annotations on that class.
        return getTheEntry(jsonEntries).getFilteredContents();
    }

    private JsonEntry getTheEntry(@RequestBody List<JsonEntry> jsonEntries) {
        return jsonEntries.stream().findFirst().get();
    }

}
