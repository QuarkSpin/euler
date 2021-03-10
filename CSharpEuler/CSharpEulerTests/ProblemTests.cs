using CSharpEuler;
using Xunit;

namespace CSharpEulerTests
{
    public class ProblemTests
    {
        [Fact]
        public void Problem001Test() => Assert.Equal(233168, new Problem001().Solve());

        [Fact]
        public void Problem002Test() => Assert.Equal(4613732, new Problem002().Solve());
    }
}
