package org.teiid.resource.adapter.solr;

import javax.resource.ResourceException;

import org.teiid.resource.spi.BasicManagedConnectionFactory;

public class SolrManagedConnectionFactory extends BasicManagedConnectionFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2751565394772750705L;
	private String url;
	private String soTimeout;
	private String allowCompression;
	private String connTimeout; // min 5 seconds to establish TCP
	private String maxConns;
	private String maxRetries;

	// expand these out in the future
	// private String maxInCriteriaSize;
	// private String useLowerCase;
	// private String parser;
	// private ConnectorEnvironment env;
	// private SingleIdentity id = null;

	@Override
	public SolrConnectionFactory createConnectionFactory()
			throws ResourceException {
		return new SolrConnectionFactory(SolrManagedConnectionFactory.this);
			
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSoTimeout() {
		return soTimeout;
	}

	public void setSoTimeout(String soTimeout) {
		this.soTimeout = soTimeout;
	}

	public String getAllowCompression() {
		return allowCompression;
	}

	public void setAllowCompression(String allowCompression) {
		this.allowCompression = allowCompression;
	}

	public String getConnTimeout() {
		return connTimeout;
	}

	public void setConnTimeout(String connTimeout) {
		this.connTimeout = connTimeout;
	}

	public String getMaxConns() {
		return maxConns;
	}

	public void setMaxConns(String maxConns) {
		this.maxConns = maxConns;
	}

	public String getMaxRetries() {
		return maxRetries;
	}

	public void setMaxRetries(String maxRetries) {
		this.maxRetries = maxRetries;
	}

}