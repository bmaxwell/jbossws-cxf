/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.wsf.stack.cxf.configuration;

import org.apache.cxf.configuration.Configurer;
import org.apache.cxf.configuration.spring.ConfigurerImpl;
import org.jboss.wsf.stack.cxf.client.configuration.JBossWSSpringConfigurer;
import org.springframework.context.ApplicationContext;

/**
 * A JBossWS CXF Configurer (Spring based) to be used on server side
 * 
 * @author alessio.soldano@jboss.com
 * @author ema@redhat.com
 * @since 31-Mar-2010
 */
public class JBossWSServerSpringConfigurer extends JBossWSSpringConfigurer
{
   public JBossWSServerSpringConfigurer(Configurer delegate, ApplicationContext ctx)
   {
      super(delegate);
      if (delegate instanceof ConfigurerImpl)
      {
         ((ConfigurerImpl)delegate).setApplicationContext(ctx);
      }
   }
}
