package com.semmle.jira.addon.util;

public class Constants {
  public static final String WORKFLOW_NAME = "LGTM alert";
  public static final String ISSUE_TYPE_NAME = "LGTM alert";

  public static final String WORKFLOW_OPEN_STATUS_NAME = "Open";
  public static final String WORKFLOW_CLOSED_STATUS_NAME = "Closed";
  public static final String WORKFLOW_SUPPRESSED_STATUS_NAME = "Suppressed";
  public static final String WORKFLOW_FALSE_POSITIVE_STATUS_NAME = "False Positive";

  public static final String WORKFLOW_REOPEN_TRANSITION_NAME = "LGTM.Reopen";
  public static final String WORKFLOW_CLOSE_TRANSITION_NAME = "LGTM.Close";

  public static final String WORKFLOW_SUPPRESS_TRANSITION_NAME = "LGTM.Suppress";
  public static final String WORKFLOW_UNSUPPRESS_TRANSITION_NAME = "LGTM.Unsuppress";
}
