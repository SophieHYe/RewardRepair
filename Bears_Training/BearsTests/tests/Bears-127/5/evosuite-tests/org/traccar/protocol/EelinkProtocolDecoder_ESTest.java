/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 03:29:10 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.DirectChannelBufferFactory;
import org.jboss.netty.buffer.ReadOnlyChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.EelinkProtocol;
import org.traccar.protocol.EelinkProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EelinkProtocolDecoder_ESTest extends EelinkProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(1183);
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-116);
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      try { 
        eelinkProtocolDecoder0.decode(localServerChannel0, mockInetSocketAddress0, bigEndianHeapChannelBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 128);
      DirectChannelBufferFactory directChannelBufferFactory0 = new DirectChannelBufferFactory(6);
      byte[] byteArray0 = new byte[2];
      ChannelBuffer channelBuffer0 = directChannelBufferFactory0.getBuffer(byteArray0, 129, 0);
      ReadOnlyChannelBuffer readOnlyChannelBuffer0 = new ReadOnlyChannelBuffer(channelBuffer0);
      try { 
        eelinkProtocolDecoder0.decode((Channel) null, inetSocketAddress0, readOnlyChannelBuffer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Readable bytes exceeded - Need 2, maximum is 0
         //
         verifyException("org.jboss.netty.buffer.AbstractChannelBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = new EelinkProtocol();
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("ul3:UIz3Eg]5H^q5n", 0);
      try { 
        eelinkProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, "ul3:UIz3Eg]5H^q5n");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         verifyException("org.traccar.protocol.EelinkProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder((EelinkProtocol) null);
      byte[] byteArray0 = new byte[8];
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      try { 
        eelinkProtocolDecoder0.decode((Channel) null, (SocketAddress) null, bigEndianHeapChannelBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocolDecoder", e);
      }
  }
}