package org.jumbune.common.beans.cluster;

import java.util.List;

public class Workers {

	/** The host */
	private List<String> hosts;
	
	/** The user. */
	private String user;
	
	/** The data node jmx port. */
	protected String dataNodeJmxPort;
	
	/** NodeManagerJmxPort, TaskTrackerJmxPort */
	private String taskExecutorJmxPort;
	
	private boolean spotInstances = false;

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDataNodeJmxPort() {
		return dataNodeJmxPort;
	}

	public void setDataNodeJmxPort(String dataNodeJmxPort) {
		this.dataNodeJmxPort = dataNodeJmxPort;
	}

	public String getTaskExecutorJmxPort() {
		return taskExecutorJmxPort;
	}

	public void setTaskExecutorJmxPort(String taskExecutorJmxPort) {
		this.taskExecutorJmxPort = taskExecutorJmxPort;
	}

	public boolean isSpotInstances() {
		return spotInstances;
	}

	public void setSpotInstances(boolean spotInstances) {
		this.spotInstances = spotInstances;
	}

	@Override
	public String toString() {
		return "Workers [hosts=" + hosts
				+ ", user=" + user + ", dataNodeJmxPort=" + dataNodeJmxPort
				+ ", taskExecutorJmxPort=" + taskExecutorJmxPort + "]";
	}
	
}
