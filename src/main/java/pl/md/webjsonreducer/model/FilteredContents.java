package pl.md.webjsonreducer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.net.InetAddress;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder({"agentVersion", "howManyAlerts", "architecture", "collector", "cpuModel", "description", "discoveryDate", "externalIp"})
public class FilteredContents {

    private String agentVersion;
    private String architecture;
    private Map<String, String> collector;
    private String cpuModel;
    private String description;
    private Date discoveryDate;
    private List<String> alertIds;
    private InetAddress externalIp;

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Integer getHowManyAlerts() {
        return alertIds.size();
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getCollector() {
        return collector.get("collectorName");
    }

    public void setCollector(Map<String, String> collector) {
        this.collector = collector;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getDiscoveryDate() {
        return discoveryDate;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSS")
    public void setDiscoveryDate(Date discoveryDate) {
        this.discoveryDate = discoveryDate;
    }

    public void setAlertIds(List<String> alertIds) {
        this.alertIds = alertIds;
    }

    public InetAddress getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(InetAddress externalIp) {
        this.externalIp = externalIp;
    }
}
