package net.ipip.ipdb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AsnInfo {

    public int ASN;

    @JsonProperty("reg")
    public String Registry;

    @JsonProperty("cc")
    public String Country;

    @JsonProperty("net")
    public String NetName;

    @JsonProperty("org")
    public String OrgName;
}
