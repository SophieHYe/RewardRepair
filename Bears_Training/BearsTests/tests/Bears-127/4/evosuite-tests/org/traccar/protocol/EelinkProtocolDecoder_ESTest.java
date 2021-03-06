/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 03:25:14 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.EelinkProtocol;
import org.traccar.protocol.EelinkProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EelinkProtocolDecoder_ESTest extends EelinkProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 2792);
      byte[] byteArray0 = new byte[6];
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      try { 
        eelinkProtocolDecoder0.decode(localChannel0, inetSocketAddress0, bigEndianHeapChannelBuffer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Not enough readable bytes - Need 2, maximum is 1
         //
         verifyException("org.jboss.netty.buffer.AbstractChannelBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(6089);
      try { 
        eelinkProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.EelinkProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 20);
      try { 
        eelinkProtocolDecoder0.decode((Channel) null, inetSocketAddress0, eelinkProtocolDecoder0.MSG_REPORT);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         verifyException("org.traccar.protocol.EelinkProtocolDecoder", e);
      }
  }
}
