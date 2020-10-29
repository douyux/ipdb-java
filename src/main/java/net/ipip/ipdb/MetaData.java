package net.ipip.ipdb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @copyright IPIP.net
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaData {
    @JsonProperty("build")
    public int Build;
    @JsonProperty("ip_version")
    public int IPVersion;
    @JsonProperty("node_count")
    public int nodeCount;
    @JsonProperty("languages")
    public Map<String, Integer> Languages;
    @JsonProperty("fields")
    public String[] Fields;
    @JsonProperty("total_size")
    public int totalSize;
}