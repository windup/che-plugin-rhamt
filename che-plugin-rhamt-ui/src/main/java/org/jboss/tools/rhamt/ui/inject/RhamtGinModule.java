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
package org.jboss.tools.rhamt.ui.inject;

import org.eclipse.che.ide.api.command.CommandType;
import org.eclipse.che.ide.api.extension.ExtensionGinModule;
import org.jboss.tools.rhamt.ui.RhamtServiceClient;
import org.jboss.tools.rhamt.ui.RhamtServiceClientImpl;
import org.jboss.tools.rhamt.ui.command.RhamtCommand;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.multibindings.GinMultibinder;
import com.google.inject.Singleton;

@ExtensionGinModule
public class RhamtGinModule extends AbstractGinModule {
	@Override
	protected void configure() {
	    GinMultibinder.newSetBinder(binder(), CommandType.class)
        		.addBinding()
        		.to(RhamtCommand.class);
	    bind(RhamtServiceClient.class).to(RhamtServiceClientImpl.class).in(Singleton.class);;
	}
}
