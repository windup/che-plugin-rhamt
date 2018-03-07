/*******************************************************************************
 * Copyright (c) 2018 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.rhamt.shared.dto;

import java.util.List;

import org.eclipse.che.dto.shared.DTO;

@DTO
public interface AnalyzeRequest {
	  List<String> getFiles();
	  AnalyzeRequest withFiles(List<String> files);
}
