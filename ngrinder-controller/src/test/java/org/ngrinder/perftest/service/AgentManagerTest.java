/*
 * Copyright (C) 2012 - 2012 NHN Corporation
 * All rights reserved.
 *
 * This file is part of The nGrinder software distribution. Refer to
 * the file LICENSE which is part of The nGrinder distribution for
 * licensing details. The nGrinder distribution is available on the
 * Internet at http://nhnopensource.org/ngrinder
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ngrinder.perftest.service;

import net.grinder.engine.controller.AgentControllerIdentityImplementation;

import org.junit.Test;
import org.ngrinder.AbstractNGrinderTransactionalTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Class description.
 *
 * @author Mavlarn
 * @since
 */
public class AgentManagerTest extends AbstractNGrinderTransactionalTest {
	
	@Autowired
	private AgentManager agentManager;

	@Test
	public void testGetMaxAgentSizePerConsole() {
		agentManager.getMaxAgentSizePerConsole();
	}

	@Test
	public void testConvert() {
		agentManager.convert(new AgentControllerIdentityImplementation("test", "127.0.0.1"));
	}

	@Test
	public void testGetAllFreeApprovedAgentsForUser() {
		agentManager.getAllFreeApprovedAgentsForUser(getTestUser());
	}

	@Test
	public void testGetAllSharedAgents() {
		agentManager.getAllSharedAgents();
	}

	@Test
	public void testFilterSharedAgents() {
		agentManager.filterSharedAgents(agentManager.getAllAttachedAgents());
	}

}